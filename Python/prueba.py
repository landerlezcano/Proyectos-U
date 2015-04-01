pyg = 'ei'

original = input('Escribe una palabra:')

if ((len(original) > 0) and original.isalpha()):
	print (original)
	original.lower()
	palabra = (original[0])
	print (palabra)
	if (palabra == "a" or palabra == "e" or palabra == "i" or palabra == "o" or palabra == "u"):
	    print ("vocal")
	else:
	    print ("consonante")
else:
	print ('Vacío')
