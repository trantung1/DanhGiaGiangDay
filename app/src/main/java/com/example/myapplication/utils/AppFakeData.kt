package com.example.myapplication.utils

import com.example.myapplication.R
import com.example.myapplication.data.model.Major
import com.example.myapplication.data.model.Subject
import com.example.myapplication.data.model.Teacher
import com.example.myapplication.data.model.User


object AppFakeData {

    var listUser = mutableListOf<User>(
        User(
            "",
            "",
            "Tran Tung",
            "tung1@gmail.com",
            "0327930123",
            "123456"
        ),
        User(
            "",
            "",
            "Khoi Nguyen",
            "khoinguyen@gmail.com",
            "0327930121",
            "123456"
        )
    )

    var listTeacher = mutableListOf<Teacher>(
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Nguyen Van A",
            "Male",
            250,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Nguyen Duc A",
            "Male",
            270,
            250,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Nguyen Van D",
            "Male",
            250,
            250,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Ngo Lan H",
            "Female",
            250,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Tran Diem Q",
            "Female",
            260,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Nguyen Cong M",
            "Male",
            200,
            250,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Nguyen Duc M",
            "Male",
            250,
            240,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Pham Khoi N",
            "Male",
            260,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Nguyen Phuong T",
            "Female",
            270,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Le Kieu C",
            "Female",
            250,
            300,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Tran Quang H",
            "Male",
            230,
            270,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Nguyen Phu Q",
            "Male",
            240,
            240,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Fmale_teacher.png?alt=media&token=46d88272-7c6f-42f0-b473-8ae04d2529c8",
            "Dang Van B",
            "Male",
            300,
            240,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Le Phuong H",
            "Female",
            250,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Nguyen Kim P",
            "Female",
            250,
            290,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Tran Thu T",
            "Female",
            250,
            280,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Nguyen Ngoc H",
            "Female",
            240,
            240,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Teacher(
            "",
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Teacher%2Ffemale_teacher.png?alt=media&token=11d4eb90-cad1-4a04-ab89-0270df9ff1dd",
            "Tran Thanh T",
            "Female",
            240,
            280,
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
    )

    var listSubject = mutableListOf<Subject>(
        Subject(
            "",
            "",
            "Lập trình Android",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt.jpg?alt=media&token=a84663e8-3b7f-4d88-9f2f-fba710a6460f",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Lập trình Android nâng cao",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt.jpg?alt=media&token=a84663e8-3b7f-4d88-9f2f-fba710a6460f",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Phát triển game trên Android",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt.jpg?alt=media&token=a84663e8-3b7f-4d88-9f2f-fba710a6460f",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Lập trình ARM nâng cao",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt.jpg?alt=media&token=a84663e8-3b7f-4d88-9f2f-fba710a6460f",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Tối ưu phần mềm nhúng",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt.jpg?alt=media&token=a84663e8-3b7f-4d88-9f2f-fba710a6460f",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Kỹ thuật lập trình an toàn",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt.jpg?alt=media&token=4b401091-8f4a-4b54-8016-9e97b6d87bb8",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "An toàn hệ điều hành",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt.jpg?alt=media&token=4b401091-8f4a-4b54-8016-9e97b6d87bb8",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Mã độc",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt.jpg?alt=media&token=4b401091-8f4a-4b54-8016-9e97b6d87bb8",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "An toàn cơ sở dữ liệu",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt.jpg?alt=media&token=4b401091-8f4a-4b54-8016-9e97b6d87bb8",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Giao thức an toàn mạng",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt.jpg?alt=media&token=4b401091-8f4a-4b54-8016-9e97b6d87bb8",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Kỹ thuật truyền số liệu",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt.png?alt=media&token=8ab3ca29-2fe2-4632-bbc9-1414d671f417",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Cơ sở lý thuyết truyền tin",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt.png?alt=media&token=8ab3ca29-2fe2-4632-bbc9-1414d671f417",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Kỹ thuật đo lường điện tử",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt.png?alt=media&token=8ab3ca29-2fe2-4632-bbc9-1414d671f417",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Hệ thống viễn thông",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt.png?alt=media&token=8ab3ca29-2fe2-4632-bbc9-1414d671f417",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Kiến trúc máy tính",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt.png?alt=media&token=8ab3ca29-2fe2-4632-bbc9-1414d671f417",
            mutableListOf(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Subject(
            "",
            "",
            "Tiếng Anh 1",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_1.jpg?alt=media&token=2aab78c0-0a47-4e62-b843-e291ccb12c46",
            mutableListOf(
                "a",
                "a",
            )

        ),
        Subject(
            "",
            "",
            "Tiếng Anh 2",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_1.jpg?alt=media&token=2aab78c0-0a47-4e62-b843-e291ccb12c46",
            mutableListOf(
                "a",
                "a",
            )

        ),
        Subject(
            "",
            "",
            "Tiếng Anh 3",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_1.jpg?alt=media&token=2aab78c0-0a47-4e62-b843-e291ccb12c46",
            mutableListOf(
                "a",
                "a",
            )

        ),
        Subject(
            "",
            "",
            "Tiếng Anh chuyên ngành",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_1.jpg?alt=media&token=2aab78c0-0a47-4e62-b843-e291ccb12c46",
            mutableListOf(
                "a",
                "a",
            )

        ),
    )

    var listMajor = mutableListOf<Major>(
        Major(
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt_3.jpg?alt=media&token=0e1d4dff-4758-4a2d-b90f-abac5f380de4",
            mutableListOf(
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt.jpg?alt=media&token=4b401091-8f4a-4b54-8016-9e97b6d87bb8,",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt_1.jpg?alt=media&token=868f4242-30da-4425-9f69-e3b8627a7ff9",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/An%20Toan%20Thong%20Tin%2Fattt_3.jpg?alt=media&token=0e1d4dff-4758-4a2d-b90f-abac5f380de4"
            ),
            "An toàn thông tin",
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            ),
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Major(
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt_4.jpg?alt=media&token=a7773c18-faad-4033-a28f-ee3c8ff4eaa1",
            mutableListOf(
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt_4.jpg?alt=media&token=a7773c18-faad-4033-a28f-ee3c8ff4eaa1",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt.jpg?alt=media&token=a84663e8-3b7f-4d88-9f2f-fba710a6460f",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt_1.jpg?alt=media&token=c3532f6a-f662-49d2-91c7-31525a703e87",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Cong%20Nghe%20Thong%20Tin%2Fcntt_3.jpg?alt=media&token=2ca00055-5f16-4878-92c5-d9129ac930f3"
            ),
            "Công nghệ thông tin",
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            ),
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            )

        ),
        Major(
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt_2.png?alt=media&token=cc7203d6-18ca-4514-84e7-3f169f4438b3",
            mutableListOf(
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt.png?alt=media&token=8ab3ca29-2fe2-4632-bbc9-1414d671f417",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt_2.png?alt=media&token=cc7203d6-18ca-4514-84e7-3f169f4438b3",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt_3.png?alt=media&token=345a070d-7074-4c84-b107-ec4b7dc5c2c8",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Dien%20Tu%20Vien%20Thong%2Fdtvt_4.png?alt=media&token=8121b89c-8013-43f3-9f69-3272987bc8a1"
            ),
            "Điện tử viễn thông",
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            ),
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        ),
        Major(
            "",
            "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_4.jpg?alt=media&token=fe14193d-dca0-49ba-90f3-d312fe10765e",
            mutableListOf(
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_3.jpg?alt=media&token=208f3125-07d5-4697-8bc1-a01fa512c842",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_2.jpg?alt=media&token=ef3c290b-e286-4e98-8f36-282662e78f49",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_1.jpg?alt=media&token=2aab78c0-0a47-4e62-b843-e291ccb12c46",
                "https://firebasestorage.googleapis.com/v0/b/danhgiagiangday.appspot.com/o/Trung%20Tam%20Ngoai%20Ngu%2Fngoai_ngu_4.jpg?alt=media&token=fe14193d-dca0-49ba-90f3-d312fe10765e"
            ),
            "Trung tâm ngoại ngữ KMA",
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            ),
            mutableListOf<String>(
                "a",
                "a",
                "a",
                "a",
                "a"
            )
        )
    )
}