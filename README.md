Niobio (NBR) = 99,9% Bitcoin (BTC)
=====================================

Minimal changes. 
It’s very easy to keep the code up to date. :-D

Niobio is Bitcoin but:
Only 1% of Bitcoin total supply (== 210.000 coins)
51% attack protection (dns checkpoint)

Dependencies - Same as BTC plus curl:
sudo apt install libcurl4-openssl-dev

To Build: DO NOT MAKE INSTALL
Please rename bitcoind to niobiocoind
./autogen.sh
./configure
./make 
mv ./src/bitcoind ./src/niobiocoind

