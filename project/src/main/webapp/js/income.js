// income_info 에서 사용
function setDate() { 
	let sdate = dateForm.start_date.value;
	let edate = dateForm.end_date.value;
	
	if(sdate === "" || edate === "") {
		alert("날짜를 입력하시오.")
		return;
	}

	if(sdate > edate) {
		alert("시작일은 종료일 이전으로 설정할 수 없습니다.");
		return;
	}

	dateForm.action="income_info.jsp?sdate=" + sdate + "&edate=" + edate;
	dateForm.method="post";
	dateForm.submit();
}

function incomeAdd() {
    window.open('incomeadd.jsp', '_blank', 'width=700,height=400,left=500,top=500');
    
}

function closeWindow() {
    window.close();
}

function cancel() {
    window.close();
}

function editIncome(code) {
    window.open('incomeupdate.jsp?income_code=' + code, 'incomeUpdateWindow', 'width=600,height=450');
}

function deleteIncome(code) {
    window.open('incomedelete.jsp?income_code=' + code, 'incomeDeleteWindow', 'width=500,height=300');
}


function filterData() {
    const filterOption = document.getElementById('filter_option').value;
    const url = 'incomefilter.jsp?filter_option=' + encodeURIComponent(filterOption);
    window.open(url, 'filterResultWindow', 'width=800,height=600');
}
