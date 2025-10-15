#list with available options
options = ["add","edit","delete","exit"]
tasks = []

while True:

    #user input
    user_input = int(input("Enter command here: ")) - 1

    if user_input > 3 or user_input < 0:
        print("Only 1,2,3 or 4 !!")
        continue

    if user_input == 0:
        task_to_add = input("Enter task to be added: ")
        tasks += task_to_add
        print('task added successfully')
    elif user_input == 1:
        task_to_edit = int(input('enter task index to edit: '))
        for i in tasks:
            if i == task_to_edit - 1:
                return tasks[i]

        changes_to_make= input('enter changes to be made: ')
        tasks[i] += chnages_to_make

        print('task edited successfully')
    elif user_input == 2:
        task_to_remove = int(input("enter task-index to be removed: "))
        for i in tasks:
            if i == task_to_remove - 1:
                removed_task = tasks.pop(i)
                print(f"Removed: {removed_task}")

    else:
        print("program is being exited...")
        break
