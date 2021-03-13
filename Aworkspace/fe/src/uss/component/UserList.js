import './css/UserList.css'

const UserList = () => (
    <>
        <div class="container">
            <table class="responsive-table">
                <caption>회원리스트</caption>
                <thead>
                    <tr>
                        <th scope="col">회원명</th>
                        <th scope="col">이메일</th>
                        <th scope="col">전화번호</th>
                        <th scope="col">주소</th>
                    </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">Frozen</th>
                    <td data-title="Released">2013</td>
                    <td data-title="Studio">Disney</td>
                    <td data-title="Worldwide Gross" data-type="currency">$1,276,480,335</td>
                </tr>
                <tr>
                    <th scope="row">Incredibles 2</th>
                    <td data-title="Released">2018</td>
                    <td data-title="Studio">Disney Pixar</td>
                    <td data-title="Worldwide Gross" data-type="currency">$1,210,072,582</td>
                </tr>
                </tbody>
            </table>
        </div>
    </>
)

export default UserList