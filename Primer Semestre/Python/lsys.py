def applyRules(lhch):
    rhstr = ""
    if lhch == 'H':
        rhstr = 'HU'   # Rule 1
    elif lhch == 'U':
        rhstr = 'UE'  # Rule 2
    elif lhch == 'E':
        rhstr = 'EH'
    else:
        rhstr = ch    # no rules apply so keep the character

    return rhstr


def processString(oldStr):
    newstr = ""
    for ch in oldStr:
        newstr = newstr + applyRules(ch)
    return newstr


def createLSystem(numIters,axiom):
    startString = axiom
    endString = ""
    print("Longitud inicial: "+str(len(startString)))
    print("Cadena inicial: " + axiom)
    for i in range(numIters):
        tempString =startString
        endString = processString(startString)
        startString = endString
        print("")
        print("")
        print("Iteracion no.: "+str(i+1))
        print("La cadena es: "+endString)
        print("La longitud de la cadena es: "+str(len(endString)))
        print("El número de caracteres creados en esta iteración fue: "+str(len(startString)-len(tempString)))
    print("")
    print("")
    print("Longitud final: "+str(len(endString)))
    return endString
secuencia = createLSystem(14,"HEUEUHUE")
print(secuencia)
