use student

db.student.insert({ "roll_no": 102, "name": "john", "age": 20, "phone": "7958679586", "email": "john@gmail.com"})

db.student.update({ "roll_no": 101 },{$set:{"email": "newEmail@email.com"}})
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })

db.student.update({ "roll_no": 100 },{$set:{"name": "FEM"}})
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })

db.student.find()