interface FileSystemNode {
    fun getParentNode(): FileSystemNode?
    fun getNameNode(): String
    fun getPathNode(): String?
    fun setParentNode(_parent: FileSystemNode)

}