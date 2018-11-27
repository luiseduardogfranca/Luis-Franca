def translate(array, rule, translate):
    return [translate if word == rule else word for word in array]
    
rules_amount = 1 
text_amount = 1 
all_texts = [] 

while (rules_amount != 0 and text_amount != 0):
    rules = []
    texts = [] 

    rules_amount , text_amount = input("").split(" ") 
    rules_amount = int(rules_amount)
    text_amount = int(text_amount)

    if (rules_amount != 0 and text_amount != 0):
        for i in range(rules_amount):
            rules.append(input("").split(" "))
        
        for i in range(text_amount):
            texts.append(input("").split(" "))

        for index_text in range(len(texts)):
            # translate to text 
            aux = texts[index_text]
            for index in range(len(rules)):
                if (rules[index][0] in texts[index_text]):
                    aux = translate(aux, rules[index][0], rules[index][2])

            # save text in array 
            texts[index_text] = aux
    
    all_texts.append(texts)

for texts in all_texts :
    for text in texts:
        print(*text)
        
