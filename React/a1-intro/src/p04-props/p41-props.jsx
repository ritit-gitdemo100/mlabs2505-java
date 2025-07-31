
export default function P41Props() {

    const title="Politiccs"
    const body = "Here is the current Politics update"
    const btn = "Moreeee"

    const cinemanews = {
        title:'Cinema',
        body: 'Top 10 movies of this week',
        btn: 'Next 10...'
    }
    return (
        <div className="row">
            <News title="Sports" body="Here is the sports update" btn="More Sports..." />
            <News title={title} body={body} btn={btn} />
            <News title={cinemanews.title} body={cinemanews.body} btn={cinemanews.btn} />
        </div>
    );
}


function News(props) {
    return (
        <div className="col-md-4" style={{border:'1px solid grey', padding:'10px'}}>
            <h2>{props.title}</h2>
            <hr />
            <p>{props.body}</p>
            <hr />
            <button>{props.btn}</button>
        </div>
    );
}