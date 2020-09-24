//Execution starts from Main

//Helper method. Flexible as it can return either of defined file system(Fat32FileSystem, ExtFileSystem or MemoryFileSystem)
//Best suitable for Testing Fakes and Dependency Injection
fun getFileSystem(): FileSystem {
//    return Fat32FileSystem() or
//    return ExtFileSystem() or
    return MemoryFileSystem(listOf("/HOME/dir", "/HOME/another_dir"), "some file content")
}

fun main() {
    //Kotlin Interfaces Example - Multiple File Systems

    val fileSystem = getFileSystem() //Helper method for getting file system
    fileSystem.readDir()
    fileSystem.readFile()
}

//Sample interface for File System
interface FileSystem {
    fun readDir(): List<String>
    fun readFile(): String
}

class Fat32FileSystem : FileSystem {
    override fun readDir(): List<String> {
        return emptyList() //returning empty list
    }

    override fun readFile(): String {
        return "" //returning empty string
    }
}

class ExtFileSystem : FileSystem {
    override fun readDir(): List<String> {
        TODO("Return List of Strings having directory paths")
    }

    override fun readFile(): String {
        TODO("Read each file from passed directories")
    }
}

class MemoryFileSystem(val files: List<String>, val fileContents: String) : FileSystem {
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
        return fileContents
    }
}