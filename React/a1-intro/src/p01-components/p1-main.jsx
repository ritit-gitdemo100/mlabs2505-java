import Cls1 from "./p10-comp";
import P11Comp from "./p11-comp";
import P13Gallery from "./p13-gallery";
import P14Variables from "./p14-variables";
import P15Args from "./p15-args";

function P1Main() {
    return (
        <>
            <Cls1 />
            <P11Comp />
            <P13Gallery />
            <P14Variables/>
            <P15Args isAuth={false}/>
        </>
    );
}

export default P1Main;