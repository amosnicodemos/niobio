Niobio (NBR) = 99,9% Bitcoin (BTC)
=====================================

Minimal changes. 

It’s very easy to keep the code up to date. :-D

Niobio is Bitcoin but:

* Only 1% of Bitcoin total supply (== 210,000 coins)
* 51% attack protection (RPC checkpoint)

Dependencies - Same as BTC plus curl and nsspem:

**Ubuntu 18**

sudo apt install autoconf

sudo add-apt-repository ppa:bitcoin/bitcoin

sudo apt update

sudo apt install libdb4.8-dev libdb4.8++-dev

sudo apt install build-essential libtool autotools-dev automake pkg-config bsdmainutils python3

sudo apt install libevent-dev libboost-dev libboost-system-dev libboost-filesystem-dev libboost-test-dev

sudo apt install libsqlite3-dev

sudo apt install libminiupnpc-dev libnatpmp-dev

sudo apt install libzmq3-dev

sudo apt install libcurl4-openssl-dev libnsspem

**To Build: DO NOT MAKE INSTALL**

* ./autogen.sh
* ./configure
* ./make 
* mv ./src/bitcoind ./src/niobiocoind

*Please rename bin file bitcoind to niobiocoind*
* mv ./src/bitcoind ./src/niobiocoind

**To Run**

niobiocoind -fallbackfee=0.00001

Your data folder in /home/youruser/.niobiocoin
