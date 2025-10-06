package net.vinh.ielts.util

import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Position
import net.minecraft.util.math.Vec3d
import kotlin.random.Random

object IeltsUtils {
    private val random: Random = Random

    fun getIntList(amount: Int, from: Int, until: Int): MutableList<Int> {
        val list: MutableList<Int> = ArrayList<Int>()

        for (i in amount downTo 1) {
            list.add(random.nextInt(from, until))
        }

        return list
    }

    fun getDoubleList(amount: Int, from: Double, until: Double): MutableList<Double> {
        val list: MutableList<Double> = java.util.ArrayList<Double>()

        for (i in amount downTo 1) {
            list.add(random.nextDouble(from, until))
        }

        return list
    }

    fun getFloatList(amount: Int, from: Float, until: Float): MutableList<Float> {
        val list: MutableList<Float> = java.util.ArrayList<Float>()

        for (i in amount downTo 1) {
            list.add(random.nextDouble(from.toDouble(), until.toDouble()).toFloat())
        }

        return list
    }

    fun getLongList(amount: Int, from: Long, until: Long): MutableList<Long> {
        val list: MutableList<Long> = java.util.ArrayList<Long>()

        for (i in amount downTo 1) {
            list.add(random.nextLong(from, until))
        }

        return list
    }

    fun getVec3dListFromBox(amount: Int, box: Box): MutableList<Vec3d> {
        val list: MutableList<Vec3d> = java.util.ArrayList<Vec3d>()

        for (i in amount downTo 1) {
            list.add(Vec3d(random.nextDouble(box.minX, box.maxX), random.nextDouble(box.minY, box.maxY), random.nextDouble(box.minZ, box.maxZ)))
        }

        return list
    }

    fun getBlockPosListFromBox(amount: Int, box: Box): MutableList<BlockPos> {
        val list: MutableList<BlockPos> = java.util.ArrayList<BlockPos>()

        for (i in amount downTo 1) {
            list.add(
                BlockPos(
                    random.nextDouble(box.minX, box.maxX).toInt(),
                    random.nextDouble(box.minY, box.maxY).toInt(),
                    random.nextDouble(box.minZ, box.maxZ).toInt()
                )
            )
        }

        return list
    }

    fun getPositionListFromBox(amount: Int, box: Box): MutableList<Position> {
        val list: MutableList<Position> = java.util.ArrayList<Position>()

        for (i in amount downTo 1) {
            list.add(object : Position {
                override fun getX(): Double {
                    return random.nextDouble(box.minX, box.maxX)
                }

                override fun getY(): Double {
                    return random.nextDouble(box.minY, box.maxY)
                }

                override fun getZ(): Double {
                    return random.nextDouble(box.minZ, box.maxZ)
                }
            })
        }

        return list
    }
}