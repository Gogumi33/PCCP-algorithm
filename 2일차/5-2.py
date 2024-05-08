# for i in range(len(t)):
#     if len(t[i:len(p)+i]) == len(p) and int(t[i:len(p)+1]) <= int(p):
#         answer += 1
        
# answer

def solution(t, p):
    answer = 0
    
    for i in range(len(t)-len(p)+1):
        if int(p) >= int(t[i:i+len(p)]):
            answer += 1
    print(answer)
    return answer
t = "500220839878"
p = "7"
solution(t, p)
