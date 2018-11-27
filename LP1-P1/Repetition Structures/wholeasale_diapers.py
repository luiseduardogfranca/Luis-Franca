register_baby = lambda age, amount_diapers: {'age': age, 'amount_diapers': amount_diapers}

def total_diapers(database):
    amount = 0 
    for key, row in database.items():
        amount += row['amount_diapers']
    return amount

database = {}
index = 0 

continue_input = "sim"

while (continue_input.upper() != "NÃO"):
    age = int(input(""))
    amount_diapers = 9 * 30 if age <= 2 else 6 * 30 
    database[index] = register_baby(age, amount_diapers)
    
    continue_input = input("")
    index += 1 

amount = total_diapers(database) 

rest = amount - (100 * (amount // 100)) 
total_packages = (amount // 100) + 1 if rest > 0 else amount // 100

print(total_packages)
print(rest if rest == 0 else 100 - rest)