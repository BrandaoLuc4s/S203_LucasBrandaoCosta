import math

val = input("Entre com um valor: ")
val = int(val)
val = math.pow(val, 3)
if(val > 100):
    print (f'valor {val} é maior que 100')
else:
    print(f'valor {val} é menor que 100')



