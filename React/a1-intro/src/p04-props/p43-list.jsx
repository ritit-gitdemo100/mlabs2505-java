export default function P43List() {

    const students = [
        { roll: 101, name: 'Arun', mark: 76 },
        { roll: 102, name: 'Balaji', mark: 96 },
        { roll: 103, name: 'Charles', mark: 86 },
        { roll: 104, name: 'Daniel', mark: 92 },
        { roll: 105, name: 'Farooq', mark: 69 }
    ];

    students.forEach(s => console.log(s))

    return (
        <div>
            <h1>Student Details</h1>
            <table>
                <thead>
                    <tr>
                        <th>Roll</th><th>Name</th><th>Mark</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        students
                        .filter( s => s.mark >= 70)
                        .sort( (a,b) => a.mark - b.mark)
                        .map(
                            (student, index) => (
                                <tr key={index}>
                                    <td>{student.roll}</td>
                                    <td>{student.name}</td>
                                    <td>{student.mark}</td>
                                </tr>
                            )
                        )
                    }
                </tbody>
                <tfoot>
                    <tr>
                        <th colSpan={2}>Average Mark</th>
                        <td>
                            {
                                (students.reduce((tot, s) => tot + s.mark, 0)) /students.length
                            }
                        </td>
                    </tr>
                </tfoot>
            </table>

        </div>
    );
}
