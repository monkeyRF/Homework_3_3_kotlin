import kotlin.random.Random

fun main() {
    val file1 = File("file1.txt")
    val file2 = File("file2.doc")
    val file3 = File("file3.png")
    val file4 = File("file4.zip")
    val file5 = File("file5.xxx")

    val folder1 = Folder("folder_one", file1, file2, file3)

    val folder2 = Folder("folder_two")
    val folder3 = Folder("folder_three")
    folder3.addFolder(folder2, file5)

    val folder = Folder("Корень")

    folder.addFolder(folder1, folder3, file4)


    println("$folder ${folder.getPathNode()} ${folder.getChildFolders()}")
    println("$folder1 ${folder1.getPathNode()} ${folder1.getChildFolders()}")
    println("$folder3 ${folder3.getPathNode()} ${folder3.getChildFolders()}")
    println("$folder2 ${folder2.getPathNode()} ${folder2.getChildFolders()}")
    println("$file1 ${file1.getPathNode()}")

    println("Расширение случайного файла в дочерней папке: " +
            folder1.getChildFolders()[Random.nextInt(0,folder1.getChildFolders().size-1)]
                   .getNameNode()
                   .substringAfterLast(".")
    )


}