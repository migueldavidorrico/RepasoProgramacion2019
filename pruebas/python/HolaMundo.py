from tkinter import messagebox, simpledialog
messagebox.showinfo('Message title','Message content')
res = messagebox.askquestion('Message title','Message content')
print(res)
answer = simpledialog.askstring("Input", "What is your first name?")
print(answer)