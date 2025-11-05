import io
import fontTools.ttLib as ttl
import fontTools.varLib.instancer as ins

def generate_static_from_variable(input, output, weight=0):
    varfont = ttl.TTFont(file = input)
    static_font = ins.instantiateVariableFont(
        varfont=varfont,
        axisLimits={"wght": weight},
        updateFontNames=True,
        static=True
    )
    static_font.save(file=output)
    varfont.close()
