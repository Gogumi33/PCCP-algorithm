def solution(num_list, n):
    answer = num_list[::n] # 슬라이싱 기법
    print(answer)

num_list = [4, 2, 6, 1, 7, 6]
n = 2

solution(num_list, n)