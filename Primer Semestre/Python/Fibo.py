def calculoNum(numIter,num1,num2):
        acum = 0
        var1 = num1
        print("1")
        print(num1)
        print("2")
        print(num2)
        var2 = num2
        for n in range(numIter):
                print(n+3)
                acum = var1+var2
                var1 = var2
                var2 = acum
                print (acum)

calculoNum(30,9,14)
