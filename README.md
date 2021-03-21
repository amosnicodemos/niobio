Niobio (NBR) = 99,9% Bitcoin (BTC)
=====================================

Minimal changes. 

It’s very easy to keep the code up to date. :-D

Niobio is Bitcoin but:

* Only 1% of Bitcoin total supply (== 210,000 coins)
* 51% attack protection (RPC checkpoint)

Dependencies - Same as BTC plus curl and nsspem:

sudo apt install libcurl4-openssl-dev

sudo apt install libnsspem

**To Build: DO NOT MAKE INSTALL**

* ./autogen.sh
* ./configure
* ./make 
* mv ./src/bitcoind ./src/niobiocoind

*Please rename bin file bitcoind to niobiocoind*
* mv ./src/bitcoind ./src/niobiocoind

Your data folder in /home/youruser/.niobiocoin
