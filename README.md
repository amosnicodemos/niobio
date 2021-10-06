Niobio (NBR) = 99,9% Bitcoin (BTC)
=====================================

Bitcoin clone. Minimal changes. 

It’s very easy to keep the code up to date. :-D

**Ubuntu 18**

sudo apt update

sudo apt install -y autoconf build-essential libtool autotools-dev automake pkg-config bsdmainutils python3 libevent-dev libboost-dev libboost-system-dev libboost-filesystem-dev libboost-test-dev libboost-thread-dev libsqlite3-dev libminiupnpc-dev libnatpmp-dev libzmq3-dev libcurl4-openssl-dev

sudo add-apt-repository ppa:bitcoin/bitcoin

sudo apt update

sudo apt install -y libdb4.8++ libdb4.8++-dev libdb4.8-dev

git clone https://github.com/soldate/niobiocoin.git

cd niobiocoin

**To Build: DO NOT MAKE INSTALL**

* ./autogen.sh
* ./configure
* make 
* mv ./src/bitcoind ./src/niobiocoind

*Please rename bin file bitcoind to niobiocoind*
* mv ./src/bitcoind ./src/niobiocoind

**To Run**

niobiocoind -fallbackfee=0.00001

Your data folder in /home/youruser/.niobiocoin
