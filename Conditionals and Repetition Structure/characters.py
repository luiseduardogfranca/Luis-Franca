def new_word(word, quantity):
    letter = ""
    if(quantity <= len(word)):
        for index in range(0, quantity):
            letter += word[index]
    return letter 

words = [] 
quant_inverse = [] 
quant = 1 
 
while quant != 0:
    quant = int(input("")) 
    if (quant > 0):
        words.append(input(""))
        quant_inverse.append(quant)
    
for i in range(len(quant_inverse)):
    # inverse all words in list 
    if(quant_inverse[i] <= len(words[i])):
        word = new_word(words[i], quant_inverse[i])
        word_inverse = ""
        for index in range(len(word) - 1, -1, -1):
            word_inverse += word[index]
        words[i] = word_inverse

for word in words:
    print(word)
        