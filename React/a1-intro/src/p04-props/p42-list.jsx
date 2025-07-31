export default function P42List() {
    
    const services = ['Training', 'Development', 'Consulting'];

    return (
        <div>
            <h1>Services Offered</h1>
            <ul>
                {
                    services.map(
                        (service, index) => (
                            <li key={index}>{service}</li>
                        )
                    )
                }
            </ul>
        </div>
    );
}
