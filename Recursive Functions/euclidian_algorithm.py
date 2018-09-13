def mdc(a, d):
    
    resto = a % d

    if (resto == 0):
        return d
    else:
        return mdc(d, resto)

quant = int(input(""))
values = [] 
results = []

for i in range(quant):
    values.append([int(value) for value in input("").split(" ")])
    results.append(mdc(values[i][0], values[i][1]))

for index in range(len(results)):
    print("MDC(%d,%d) = %d" %(values[index][0], values[index][1], results[index]))
