import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checkpoint {

	private static void watch(final Process process) {
		new Thread() {
			@Override
			public void run() {
				BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line = null;
				try {
					if ((line = input.readLine()) != null) {
						System.out.println(line);
					}

					String[] command = { "/bin/bash", "-c", "echo " + line + " > " + "../../bestblockhash.txt" };
					Runtime.getRuntime().exec(command);

					Thread.sleep(1000);

					Runtime.getRuntime().exec(new String[] { "/bin/bash", "-c", "cd ../.. && git push" });

				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		while (true) {
			ProcessBuilder builder = new ProcessBuilder("../../src/bitcoin-cli", "getbestblockhash");
			builder.redirectErrorStream(true);
			final Process process = builder.start();

			// Watch the process
			watch(process);
			Thread.sleep(30 * 1000); // 30s
		}

	}

}
