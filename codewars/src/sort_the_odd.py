def sort_array(source_array):
    for idx1, val1 in enumerate(source_array):
        if val1 % 2 == 1:
            min_indice_found = None
            min_val = val1
            for idx2, val2 in enumerate(source_array[min(idx1 + 1,len(source_array)):]):
                if val2 < min_val and val2 % 2 == 1:
                    print('value found', min(idx1 + 1,len(source_array)) + idx2, val2)
                    min_val_found = val2
                    min_indice_found = idx1 + idx2
            if min_indice_found is not None:
                source_array[min_indice_found] = val1
                source_array[idx1] = min_val_found
    return source_array