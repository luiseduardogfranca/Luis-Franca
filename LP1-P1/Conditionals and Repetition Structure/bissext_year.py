# find next bisssext year based on 'first_year' if it is not bissext
def get_next_bissext_year(year):
    is_bissext = False 

    while(not is_bissext):
        if (check_bissext_year(year)):
            is_bissext = True         
        else:
            year += 1  
    
    if (is_bissext):
        return year 

def check_bissext_year(year):
    if ((year % 4 == 0) and ((year % 100 != 0) or (year % 400 == 0))):
            return True
    else:
        return False 

bissext_years = [] 
first_year, last_year = input().split(" ")

#convert to int 
first_year = get_next_bissext_year(int(first_year))
last_year = int(last_year)

for year in range(first_year, last_year + 1, 4):
    if (check_bissext_year(year)):
        bissext_years.append(year)

if(len(bissext_years) == 0):
    print(-1)
else:
    for year in bissext_years:
        print(year)