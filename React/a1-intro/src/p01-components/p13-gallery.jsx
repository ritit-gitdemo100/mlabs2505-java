
function Pic() {
    return (
        <div className="col-md-4">
            <img src="https://myrightbird.com/assets/uploads/mybird_sun_conure_on_perch-900x651.jpg"
                width={100} height={100} />
        </div>
    )
}

function P13Gallery() {
    return (
        <section className="row bg-danger">
            <Pic />
            <Pic />
            <Pic />
        </section>
    );
}

export default P13Gallery;