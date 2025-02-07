import pyautogui
import time

# Open the file using a context manager
with open("text.txt", 'r') as file:
    time.sleep(2)  # Gives time to switch to the target application window

    # Loop over each line in the file
    for line in file:
        pyautogui.typewrite(line.strip())  # Strip newline characters for cleaner output
        pyautogui.press('enter')
        time.sleep(10)  # Wait a second before typing the next line