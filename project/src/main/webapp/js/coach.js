function closeWindow() {
    window.opener.location.reload();
    window.close();
}

function addCoach() {
    console.log("addCoach called");
    const url = 'coachadd.jsp';
    window.open(url, 'addCoach', 'width=600,height=400');
}

function submitAddForm() {
    let form = document.getElementById('addForm');
    let teamcode = form.coachTeamcode.value;
    let name = form.coachName.value;
    let pos = form.coachPos.value;
    let lic = form.coachLic.value;
    let ibdan = form.coachIbdan.value;

    if (teamcode === "") {
        alert("팀 코드를 입력해주세요.");
        return false;
    }
    if (name === "") {
        alert("이름을 입력해주세요.");
        return false;
    }
    if (pos === "") {
        alert("포지션을 선택해주세요.");
        return false;
    }
    if (lic === "") {
        alert("라이선스를 입력해주세요.");
        return false;
    }
    if (ibdan === "") {
        alert("입단 날짜를 선택해주세요.");
        return false;
    }

    return true;
}

function editCoach(code, teamcode, name, pos, lic, ibdan) {
    console.log("editCoach called with", code, teamcode, name, pos, lic, ibdan);
    const url = `coachupdate.jsp?code=${code}&teamcode=${teamcode}&name=${name}&pos=${pos}&lic=${lic}&ibdan=${ibdan}`;
    window.open(url, 'editCoach', 'width=600,height=400');
}

function submitEditForm() {
    let form = document.getElementById('editForm');
    form.submit();
}

function deleteCoach(code) {
    console.log("deleteCoach called with", code);
    const url = `coachdelete.jsp?code=${code}`;
    window.open(url, 'deleteCoach', 'width=600,height=400');
}

function confirmDelete() {
    let form = document.getElementById('deleteForm');
    form.submit();
}
