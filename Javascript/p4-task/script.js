// DOM elements
const taskInput = document.getElementById('taskInput');
const addTaskBtn = document.getElementById('addTaskBtn');
const taskList = document.getElementById('taskList');
const errorMessage = document.getElementById('error-message');

// Event listener for adding a task
addTaskBtn.addEventListener('click', function() {
  const taskText = taskInput.value.trim();
  
  if (!taskText) {
    errorMessage.textContent = "Task cannot be empty!";
    return;
  }
  
  // Create new task element
  const li = document.createElement('li');
  li.innerHTML = `
    <input type="checkbox" class="task-checkbox">
    <span>${taskText}</span>
    <button class="delete-btn">Delete</button>
  `;
  
  // Add task to the list
  taskList.appendChild(li);
  
  // Clear input field
  taskInput.value = '';
  errorMessage.textContent = '';
  
  // Task completed functionality
  const checkbox = li.querySelector('.task-checkbox');
  checkbox.addEventListener('change', function() {
    li.classList.toggle('completed', checkbox.checked);
  });
  
  // Delete task functionality
  const deleteBtn = li.querySelector('.delete-btn');
  deleteBtn.addEventListener('click', function() {
    taskList.removeChild(li);
  });
});

// Optional: Local Storage to remember tasks (Advanced)
window.addEventListener('load', function() {
  const savedTasks = JSON.parse(localStorage.getItem('tasks')) || [];
  savedTasks.forEach(task => {
    const li = document.createElement('li');
    li.innerHTML = `
      <input type="checkbox" class="task-checkbox" ${task.completed ? 'checked' : ''}>
      <span class="${task.completed ? 'completed' : ''}">${task.text}</span>
      <button class="delete-btn">Delete</button>
    `;
    taskList.appendChild(li);
    
    const checkbox = li.querySelector('.task-checkbox');
    checkbox.addEventListener('change', function() {
      li.classList.toggle('completed', checkbox.checked);
      updateLocalStorage();
    });
    
    const deleteBtn = li.querySelector('.delete-btn');
    deleteBtn.addEventListener('click', function() {
      taskList.removeChild(li);
      updateLocalStorage();
    });
  });
});

function updateLocalStorage() {
  const tasks = [];
  const taskItems = document.querySelectorAll('#taskList li');
  
  taskItems.forEach(item => {
    tasks.push({
      text: item.querySelector('span').textContent,
      completed: item.querySelector('.task-checkbox').checked
    });
  });
  
  localStorage.setItem('tasks', JSON.stringify(tasks));
}
