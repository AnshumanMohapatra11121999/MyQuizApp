package com.example.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //Q1
        val que1 = Question(
            1,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_argentina,"Argentina","Australia"
            ,"Armenia","India",1
        )
        questionsList.add(que1)
        //Q2
        val que2 = Question(
            2,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_australia,"Argentina","Australia"
            ,"Armenia","India",2
        )
        questionsList.add(que2)
        //Q3
        val que3 = Question(
            3,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_belgium,"Argentina","Australia"
            ,"Belgium","India",3

        )
        questionsList.add(que3)
        //Q4
        val que4 = Question(
            4,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_brazil,"Argentina","Australia"
            ,"Armenia","Brazil",4
        )
        questionsList.add(que4)
        //Q5
        val que5 = Question(
            5,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_fiji,
            "Japan","Fiji"
            ,"France","India",2
        )
        questionsList.add(que5)

        //Q6
        val que6= Question(
            6,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_denmark,"Argentina","Australia"
            ,"Denmark","Norway",3
        )
        questionsList.add(que6)
        //Q7
        val que7 = Question(
            7,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_germany,"Germany","Belgium"
            ,"UnitedKingDom","Mauritius",1
        )
        questionsList.add(que7)
        //Q8
        val que8 = Question(
            8,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_india,"Argentina","Australia"
            ,"Armenia","India",4
        )
        questionsList.add(que8)
        //Q9
        val que9 = Question(
            9,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_kuwait,"Argentina","Kuwait"
            ,"Armenia","India",2
        )
        questionsList.add(que9)
        //Q10
        val que10 = Question(
            10,"What Country does this Flag Belongs to?",R.drawable.ic_flag_of_new_zealand,
            "New-Zealand","Kuwait"
            ,"Armenia","India",1
        )
        questionsList.add(que10)
        return questionsList
    }

}