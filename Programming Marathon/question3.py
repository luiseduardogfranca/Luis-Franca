values = int(input(""))

valores = [int(i) for i in input("").split(" ")]
conj = {}

index = 0
count = 0

valor_aux = valores[index]

while index < len(valores):
    if valor_aux == valores[index]:
        count += 1

    elif index + 1 == len(valores) and valor_aux != valores[index]:
        conj[count] = valor_aux
        count = 1
        conj[count] = valores[index]

    else:
        conj[count] = valor_aux
        valor_aux = valores[index]
        count = 1

    if index + 1 == len(valores) and valor_aux == valores[index]:
        conj[count] = valor_aux

    index += 1

print(max(conj))
