class File(
    override val name: String
): AbstractFileSystemNode() {
    override var parent: FileSystemNode? = null



}