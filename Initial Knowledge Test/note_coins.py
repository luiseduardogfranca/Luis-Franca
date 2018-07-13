# storage notes and result 
possible_notes = [100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01]
result = [] 

# input 
money = float(input(""))

# calculates 
for note in possible_notes:
    calc = int(money / note)
    result.append(int(calc))
    money = round(money - (calc * note), 2)

#output notes
print("NOTAS:")
for index in range(int(len(possible_notes) / 2)):
    print("%d nota(s) de R$ %.2f" % (result[index], possible_notes[index]))

# output coins 
print("MOEDAS:")
for index in range(int(len(possible_notes) / 2), len(possible_notes)):
    print("%d moeda(s) de R$ %.2f" % (result[index], possible_notes[index]))
