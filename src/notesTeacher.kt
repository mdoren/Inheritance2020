class notesTeacher (var Subject: String,
                    firstName: String,
                    lastName: String
                    ): notesPerson(firstName, lastName) {
    init{

    }
}

class notesBusinessPerson(var company: String,
                            firstName: String,
                            lastName: String):
                notesPerson(firstName, lastName){
    init{

    }
}