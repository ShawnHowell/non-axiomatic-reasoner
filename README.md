# HoloNAL

A proof-of-concept of Non-Axiomatic Logic's ability to build & infer from semantic graphs using Holochain as the memory backend for those graphs.

## Project Dependencies

 - Primary dev dependency is the Holochain command line tools.
     - holochain-cmd {https://github.com/holochain/holochain-cmd}
 - The Rust Compiler 
     - holochain-rust {https://github.com/holochain/holochain-rust}
       Included within the compiler -
         - hdk-rust {https://github.com/holochain/hdk-rust}
 - Nodejs and NPM for compiling & hosting
     - nodejs & npm {https://nodejs.org/en/download/}
 - `hcshell`
     - HCShell {https://github.com/holochain/holosqape#hcshell}

## Project Structure

├─references/ - Software structure reference files.
├─zomes/ - Modules of the hApp.
─├─capabilities/ - Zome capabilities/IS-Membrane specs.
─├─code/ - Zome implementation.
─├─entry_types/ - Zome entry types in subfolders.
──├─<entry_name>/ - Sample entry type.
├─test/ - Testing library for Zome Functions.
├─dist/ - Distribution folder (build folder).



