def cacheContents(callLogs):
count_dict = {}
cache_values = []
call_log_dict = {}
min_time = math.inf
max_time = -math.inf
for time, value in callLogs:
    if time > max_time:
        max_time = time
    if time < min_time:
        min_time = time
        
if call_log_dict.get(time):
    call_log_dict[time].append(value)
else:
    call_log_dict[time] = [value]
for time in range(min_time, max_time+1):
    values = call_log_dict[time]

for c_key, c_value in count_dict.items():
    if c_value > 0 and c_key not in values:
        count_dict[c_key] -= 1

for value in values:
    if count_dict.get(value):
        count_dict[value] += 2
    else:
        count_dict[value] = 2
for count_key, value in count_dict.items():
    if value > 5 and count_key not in cache_values:
        cache_values.append(count_key)
    if value <= 3 and count_key in cache_values:
        cache_values.remove(count_key)
return cache_values