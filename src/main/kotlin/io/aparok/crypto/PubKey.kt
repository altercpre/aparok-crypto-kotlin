package io.aparok.crypto

interface PubKey {
    fun verify(data: ByteArray, sig: ByteArray): Boolean
    fun account(): String
}