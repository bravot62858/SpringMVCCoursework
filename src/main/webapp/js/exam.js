function updateExam(index){
	document.getElementById('exam').action = '/SpringmvcCoursework/mvc/coursework6/exam/' + index;
	document.getElementById('exam').submit();
}

function deleteExam(index){
	document.getElementById('_method').value = 'DELETE';
	updateExam(index);
}

function updateExamNote(index, examNote){
	var updateNote = prompt('備註修改', examNote);
	document.getElementById('_method').value = 'PUT';
	document.getElementById('examNote').value = updateNote;
	document.getElementById('exam').action = '/SpringmvcCoursework/mvc/coursework6/exam/' + index +'/exam_note';
	document.getElementById('exam').submit();
}