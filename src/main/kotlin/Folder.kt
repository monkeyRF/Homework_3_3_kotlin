class Folder(
    override val name: String,
    vararg folders: FileSystemNode
): AbstractFileSystemNode() {
    override var parent: FileSystemNode? = null
    private val childs: MutableList<FileSystemNode> = mutableListOf()

    init {
        for (f in folders) {
            f.setParentNode(this)
            childs.add(f)
        }
    }

    fun addFolder(vararg _childs: FileSystemNode) {
        for (p in _childs) {
            p.setParentNode(this)
            childs.add(p)
        }
    }

    init {
        parent?.let { childs.add(it) }
    }

    fun getChildFolders(): List<FileSystemNode> {
        return childs
    }
}