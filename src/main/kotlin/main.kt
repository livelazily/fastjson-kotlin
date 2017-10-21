import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.annotation.JSONField

fun main(args: Array<String>) {
    val dt = DataClass("ccc", "ddd")
    val json = JSON.toJSONString(dt)
    println(json)
}

data class DataClass(
        @JSONField(name = "Id")
        val Aa: String,

        @JSONField(name = "Name")
        val Bb: String
)