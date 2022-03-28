abstract class AbstractFileSystemNode: FileSystemNode {
    abstract val name: String
    abstract var parent: FileSystemNode?

    override fun setParentNode(_parent: FileSystemNode) {
        parent = _parent
    }

    override fun getNameNode(): String = name

    override fun getParentNode(): FileSystemNode? = parent

    override fun getPathNode(): String? {
        var str = ""
        var prnt: FileSystemNode? = parent
        while (prnt != null) {
            str = "$prnt/$str"
            prnt = prnt.getParentNode()
        }
        return if (parent == null) "" else "$str$name"
    }

    override fun toString(): String = name
}