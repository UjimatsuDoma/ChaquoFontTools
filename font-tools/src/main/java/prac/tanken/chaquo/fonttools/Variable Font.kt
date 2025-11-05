package prac.tanken.chaquo.fonttools

import android.content.Context

val Context.MODULE_VARIABLE_FONT
    get() = this.PYTHON.getModule("varfont")

fun Context.generateStaticFontFromVariableByWeight(
    inputPath: String,
    outputPath: String,
    weight: Int = 0
) {
    MODULE_VARIABLE_FONT.callAttr(
        "generate_static_from_variable",
        inputPath, outputPath, weight
    )
}