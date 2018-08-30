def total_ponto(senha, chute):

    ponto_acerto, arr_senha, arr_chute = conta_acerto(senha, chute)
    ponto_chute = conta_chute(arr_senha, arr_chute)

    return (ponto_acerto, ponto_chute)


def conta_acerto(senha, chute):

    ponto_acerto = 0
    arr_senha = [i for i in senha]
    arr_chute = [i for i in chute]

    for i in range(len(arr_senha)):
        if arr_senha[i] == arr_chute[i]:
            ponto_acerto += 1
            arr_senha[i] = None
            arr_chute[i] = None

    return ponto_acerto, arr_senha, arr_chute


def conta_chute(arr_senha, arr_chute):
    conj = {}

    for i in range(len(arr_senha)):
        if arr_chute[i] != None and arr_chute[i] in arr_senha:
            conj[arr_chute[i]] = 1

    soma = 0
    for key in conj:
        soma += conj[key]

    return soma


def verifica_zero(arr):

    count = 0

    for i in arr:

        if i == 0:
            count += 1

    if count == len(arr):
        return True
    else:
        return False


quant = int(input(""))
pontos = []

for i in range(quant):

    tamanho = int(input())
    senha = [int(i) for i in input("")]
    chute = [int(i) for i in input("")]

    if not verifica_zero(chute):

        ponto_acerto, ponto_chute = total_ponto(senha, chute)

        acertou = True if (ponto_acerto == len(senha)) else False

        pontos.append(total_ponto(senha, chute))

        while (not acertou) and (not verifica_zero(chute)):

            chute = [int(i) for i in input("")]

            if not verifica_zero(chute):
                ponto_acerto, ponto_chute = total_ponto(senha, chute)
                acertou = True if (ponto_acerto == len(senha)) else False
                pontos.append(total_ponto(senha, chute))

for i in pontos:
    a, b = i
    print("(%d,%d)" % (a, b))
