"""
 developed by Walesca <3
"""

a = 0
total_diana = 0
total_clara = 0

while True:
    if (a == 6):
        break

    num = float(input())
    nome = input()
   
    if (nome != "Clara" and nome != "Diana"):
        break

    Inters.append(num)
    Nomes.append(nome)
    
    if (Nomes[a] == "Diana"):
        total_diana += Inters[a]

    else:
        total_clara += Inters[a]
    
    a += 1

if (total_clara > total_diana):
    print("DIANA")
    print("%.2f" % ((total_clara - total_diana) / 2.0))

elif (total_clara < total_diana):
    print("CLARA")
    print("%.2f" % ((total_diana - total_clara) / 2.0))

else:
    print("MORADORAS QUITES")
