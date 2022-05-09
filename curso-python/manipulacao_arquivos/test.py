import math

# import requests

# response = requests.get("https://pokeapi.co/api/v2/pokemon?limit=151")

# data = response.json()

# for items in data.get('results'):
#     print(items)

# def group_by_owners(files):
#     list = []
#     list2 = []
#     p = {}
#     p2 = {}
#     for x, i in files.items():
#         if files.get(x) == 'Randy':
#             list.append(x)
#             p = {i : list}
#         if files.get(x) == 'Stan':
#             list2.append(x)
#             p2 = {i : list2}
#     p.update(p2)
#     return p
        
# if __name__ == "__main__":    
#     files = {
#         'Input.txt': 'Randy',
#         'Code.py': 'Stan',
#         'Output.txt': 'Randy'
#     }   
#     print(group_by_owners(files))


# def find_roots(a, b, c):
#     op1 = (-b + math.sqrt(b**2 - (4 * a * c))) / (2 * a)
#     op2 = (-b - math.sqrt(b**2 - (4 * a * c))) / (2 * a)
#     tupla = (op1, op2)

#     return tupla

# print(find_roots(2, 10, 8))

# def unique_names(names1, names2):
    
#     return list(set(names1).union(set(names2)))
    

# if __name__ == "__main__":
#     names1 = ["Ava", "Emma", "Olivia"]
#     names2 = ["Olivia", "Sophia", "Emma"]
#     print(unique_names(names1, names2)) # should print Ava, Emma, Olivia, Sophia

# class IceCreamMachine:
    
#     def __init__(self, ingredients, toppings):
#         self.ingredients = ingredients
#         self.toppings = toppings
        
#     def scoops(self):
#         list = []
#         for x in self.ingredients:
#             for i in self.toppings:
#                 if self.ingredients == False or self.toppings == False:
#                     return []     
#                 else:  
#                     list.append([x,i])  
#         return list        
        

# if __name__ == "__main__":
#     machine = IceCreamMachine(["vanilla", "chocolate"], ["chocolate sauce"])
#     print(machine.scoops()) #should print[['vanilla', 'chocolate sauce'], ['chocolate', 'chocolate sauce']]

print("Olá")