package com.example.kotlinbootcampforprogrammerstasks.classes.delegation

interface Downloader {
    fun download()
}

interface Player {
    fun play()
}

// creat two interfaces that provide 2 functions

class FileDownloader(private val file: String = "File.mkv") : Downloader {
    override fun download() {
        println("$file is downloading.")
    }
}

class FilePlayer(private val file: String = "File.mkv") : Player {
    override fun play() {
        println("$file is playing.")
    }
}

// create 2 classes which inherit the 2 interfcaes and provide
// implementation of their abstract functions

class MediaFile(
    private val downloader: Downloader,
    private val player: Player,
) : Downloader by downloader, Player by player

// The by-clause in the supertype list for MediaFile indicates that
// downloader and player will be stored internally
// in objects of MediaFile
// and the compiler will generate all the methods of Downloader and
// Player that forward to downloader and player.


// Overriding a member of an interface implemented by delegation

interface Downloader2 {
    fun download()
}

interface Player2 {
    fun play()
}

class FileDownloader2(private val file: String = "File.mkv") : Downloader2 {
    override fun download() {
        println("$file is downloading.")
    }
}

class FilePlayer2(private val file: String = "File.mkv") : Player2 {
    override fun play() {
        println("$file is playing.")
    }
}

class MediaFile2(
    private val downloader: Downloader2,
    private val player: Player2,
) : Downloader2 by downloader, Player2 by player {

    override fun play() {
        println("File.mkv will play soon")
    }

// when play() is overridden in the class where the delegation
// is implemented, the new outcome provided by it will be the
// result
}

// Note, however, that members overridden in this way do not get called from the members
// of the delegate object, which can only access its
// own implementations of the interface members:

interface Downloader3 {
    val queueNumber: Int
    fun download()
}

interface Player3 {
    fun play()
}

class FileDownloader3(private val file: String = "File.mkv") : Downloader3 {
    override val queueNumber: Int = 15
    override fun download() {
        println("$file number $queueNumber is downloading.")
    }
}

class FilePlayer3(private val file: String = "File.mkv") : Player3 {
    override fun play() {
        println("$file is playing.")
    }
}

class MediaFile3(
    private val downloader: Downloader3,
    private val player: Player3,
) : Downloader3 by downloader, Player3 by player {
    override val queueNumber: Int = 25
}