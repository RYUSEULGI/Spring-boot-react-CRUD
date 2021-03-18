import React from 'react'
import './css/ArticleForm.css'

const ArticleAdd = () => (
    <>
        <h2>글쓰기</h2>
        <p>Resize the browser window to see the effect. When the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other.</p>

        <div className="container">
            <form>
                <div className="row">
                    <div className="col-25">
                        <label for="fname">Name</label>
                    </div>
                    <div className="col-75">
                        <input type="text" id="fname" name="firstname" placeholder="Your name.."/>
                    </div>
                </div>
                <div className="row">
                    <div className="col-25">
                        <label for="subject">Subject</label>
                    </div>
                    <div className="col-75">
                        <textarea id="subject" name="subject" placeholder="Write something.." style={{height:"200px"}}></textarea>
                    </div>
                </div>
                <div className="row">
                    <input type="submit" value="등록하기"/>
                </div>
            </form>
        </div>
    </>
)

export default ArticleAdd