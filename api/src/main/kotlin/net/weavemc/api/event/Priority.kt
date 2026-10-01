package net.weavemc.api.event

enum class Priority(val value: Int) {
    LOWEST(0),
    LOW(1),
    NORMAL(2),
    HIGH(3),
    HIGHEST(4)
}