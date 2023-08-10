package com.example.kotlinbootcampforprogrammerstasks.classes.delegation

fun main() {

    val mediaFile = MediaFile(FileDownloader(), FilePlayer())
    mediaFile.download()
    mediaFile.play()

// Overriding a member of an interface implemented by delegation

    val mediaFile2 = MediaFile2(FileDownloader2(), FilePlayer2())
    mediaFile2.download()
    mediaFile2.play()

// Note, however, that members overridden in this way do not get called from the members
// of the delegate object, which can only access its
// own implementations of the interface members:

    val mediaFile3 = MediaFile3(FileDownloader3(), FilePlayer3())
    mediaFile3.download()
    mediaFile3.play()

}